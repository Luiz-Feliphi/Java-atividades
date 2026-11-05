package Lista5.num30;

import java.util.ArrayList;

public class num30 {
    // 30) Implemente uma classe Hospital que agregue objetos como Médico, Enfermeiro,
    //     Paciente.

    // AGREGAÇÃO: médicos, enfermeiros e pacientes existem fora do hospital e só são
    // vinculados a ele. Um paciente que tem alta continua existindo.

    public static void main(String[] args) {

        Medico medico = new Medico("Dr. Carlos", "CRM-1234", "Clinico Geral");
        Enfermeiro enfermeiro = new Enfermeiro("Ana", "COREN-5678");
        Paciente paciente1 = new Paciente("Joao", 45);
        Paciente paciente2 = new Paciente("Maria", 32);

        Hospital hospital = new Hospital("Hospital Municipal");
        hospital.adicionarMedico(medico);
        hospital.adicionarEnfermeiro(enfermeiro);
        hospital.internarPaciente(paciente1);
        hospital.internarPaciente(paciente2);

        hospital.mostrar();

        hospital.darAlta(paciente1);
        System.out.println("\nDepois da alta de " + paciente1.getNome() + ":");
        hospital.mostrar();
        System.out.println(paciente1.getNome() + " continua existindo fora do hospital.");
    }
}

class Medico {

    private String nome;
    private String crm;
    private String especialidade;

    public Medico(String nome, String crm, String especialidade) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String descricao() {
        return nome + " (" + crm + ") - " + especialidade;
    }
}

class Enfermeiro {

    private String nome;
    private String coren;

    public Enfermeiro(String nome, String coren) {
        this.nome = nome;
        this.coren = coren;
    }

    public String descricao() {
        return nome + " (" + coren + ")";
    }
}

class Paciente {

    private String nome;
    private int idade;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String descricao() {
        return nome + ", " + idade + " anos";
    }
}

class Hospital {

    private String nome;
    private ArrayList<Medico> medicos = new ArrayList<>();
    private ArrayList<Enfermeiro> enfermeiros = new ArrayList<>();
    private ArrayList<Paciente> pacientes = new ArrayList<>();

    public Hospital(String nome) {
        this.nome = nome;
    }

    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void adicionarEnfermeiro(Enfermeiro enfermeiro) {
        enfermeiros.add(enfermeiro);
    }

    public void internarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void darAlta(Paciente paciente) {
        pacientes.remove(paciente);
    }

    public void mostrar() {

        System.out.println("Hospital: " + nome);

        for (Medico m : medicos) {
            System.out.println("  Medico: " + m.descricao());
        }

        for (Enfermeiro e : enfermeiros) {
            System.out.println("  Enfermeiro: " + e.descricao());
        }

        for (Paciente p : pacientes) {
            System.out.println("  Paciente internado: " + p.descricao());
        }
    }
}

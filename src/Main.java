import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Javascript");
        curso2.setDescricao("Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria sobre Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de JS");
        mentoria2.setDescricao("Mentoria sobre JS");
        mentoria2.setData(LocalDate.now());

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devIsabela = new Dev();
        devIsabela.setNome("Isabela");
        devIsabela.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos "+ devIsabela.getConteudosInscritos());
        devIsabela.progredir();
        System.out.println("-Progrediu-");
        System.out.println("Conteúdos inscritos "+ devIsabela.getConteudosInscritos());
        System.out.println("Conteúdos concluídos "+ devIsabela.getConteudosConcluidos());
        System.out.println("XP: "+devIsabela.calcularTotalXp());

        System.out.println("--------------------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos "+devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("Conteúdos inscritos "+ devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluídos "+ devMaria.getConteudosConcluidos());
        System.out.println("XP: "+devMaria.calcularTotalXp());
    }
}

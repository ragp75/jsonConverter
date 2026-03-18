package com.example.commandline.jsonConverter;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class JsonConverterApplication implements CommandLineRunner {
	ObjectMapper objectMapper = new ObjectMapper();
	public static void main(String[] args) {
		SpringApplication.run(JsonConverterApplication.class, args);
	}

    public void run() throws Exception {
        run((String[]) null);
    }

    @Override
	public void run(String... args) throws Exception {
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int times;
        times = scanner.nextInt();
        for (int i = 1; i <=9 times; i++) {
			System.out.println(i);
		}*/


		System.out.println("writting tarefa object to file");
		File file;
		file = getFile(-1);
		objectMapper.writeValue(file, fillTarefaWithExample());

		readTarefasFiles();
	}

	private void readTarefasFiles() {
		int counter = 0;
		boolean hasTarefas = isHasTarefa(counter);
		while (hasTarefas){
			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            try {
                Tarefa tarefa = objectMapper.readValue(getFile(counter), Tarefa.class);
				System.out.println("read tarefa file "+counter);
				System.out.println(tarefa.toString());
            } catch (IOException e) {
				System.err.println("Error reading file tarefa" + counter+".json");
                throw new RuntimeException(e);
            }
            counter++;
			hasTarefas = isHasTarefa(counter);
		}
	}

	private boolean isHasTarefa(int counter) {
		File file = getFile(counter);
		return file.exists();
	}

	private static @NonNull File getFile(int counter) {
		if (counter == -1) {
			return new File("tarefa.json");
		}
		return new File("tarefa"+counter+".json");
	}

	public Tarefa fillTarefaWithExample(){
		Tarefa tarefa = new Tarefa();
		tarefa.setConcluida(true);
		tarefa.setDescricao("tarefa do exercicio");
		tarefa.setPessoaResponsavel("Renato");
		return tarefa;
	}
}


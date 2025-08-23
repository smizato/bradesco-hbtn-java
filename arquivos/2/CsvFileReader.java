import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;     

public class CsvFileReader {
    public static void main(String[] args) {
        String fileName = "funcionarios.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String linha;

            while ((linha = reader.readLine()) != null) {
                System.out.printf("Funcionário: %s\n", linha.split(",")[0]);
                System.out.printf("Idade: %s\n", linha.split(",")[1]);
                System.out.printf("Departamento: %s\n", linha.split(",")[2]);
                System.out.printf("Salarial: %s\n", linha.split(",")[3]);
                System.out.println("------------------------");
            }
            System.err.println("Leitura do arquivo concluída.\n");
        } catch (IOException e) {
            System.out.printf("Erro ao ler o arquivo: %s \n", e.getMessage());
        }

    }
}
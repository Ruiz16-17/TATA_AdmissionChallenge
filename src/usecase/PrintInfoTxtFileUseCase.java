package usecase;

import models.Drink;
import utils.Message;

import java.io.*;

public class PrintInfoTxtFileUseCase {

    private Message message = new Message();

    public String apply(String nameFile, Drink[][] store){

        File file;
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        PrintWriter printWriter;

        try {

            file = new File(nameFile);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);

            printWriter.write("Estantería de productos");
            for (int i = 0; i < 5; i++) {
                printWriter.append("\n");
                printWriter.append("\n");
                for (int j = 0; j < 5; j++) {
                    if(store[j][i] != null){

                        printWriter.append( store[j][i].toString());
                        printWriter.append("\n");
                        printWriter.append("\n");
                    }
                }

            }

            printWriter.close();
            bufferedWriter.close();


        }catch (Exception exception){
            return message.getERROR();
        }
        return message.getCREATE_TXT_FILE();
    }

}

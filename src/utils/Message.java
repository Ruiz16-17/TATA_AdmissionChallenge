package utils;

public class Message {

    private final String INCORRECT_OPTION = "OPCIÓN INCORRECTA";
    private final String ADDED = "AGREGADO";
    private final String REMOVED = "ELIMINADO";
    private final String PRICE = "EL PRECIO ES DE: ";
    private final String NOT_FOUND = "NO ENCONTRADO";

    public String message(String message) {
        return "\n" +
                printMiddleGuines(message) +
                "\n" +
                "|" + message + "|" +
                "\n" +
                printMiddleGuines(message) +
                "\n";
    }

    private String printMiddleGuines (String message){
        String middleGuines="";
        for (int i = 0; i < message.length(); i++) {
            middleGuines += "-";
        }

        return middleGuines;
    }

    public String getINCORRECT_OPTION() {
        return message(INCORRECT_OPTION);
    }

    public String getADDED() {
        return message(ADDED);
    }

    public String getREMOVED() {
        return message(REMOVED);
    }

    public String getPRICE() {
        return PRICE;
    }

    public String getNOT_FOUND() {
        return message(NOT_FOUND);
    }
}

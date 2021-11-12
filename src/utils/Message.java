package utils;

public class Message {

    private final String INCORRECT_OPTION = "OPCIÓN INCORRECTA";
    private final String ADDED = "AGREGADO";
    private final String REMOVED = "ELIMINADO";

    public String message(String message) {
        return "\n" +
                "-------------------" +
                "\n" +
                "|" + message + "|" +
                "\n" +
                "-------------------" +
                "\n";
    }

    public String getINCORRECT_OPTION() {
        return INCORRECT_OPTION;
    }

    public String getADDED() {
        return ADDED;
    }

    public String getREMOVED() {
        return REMOVED;
    }
}

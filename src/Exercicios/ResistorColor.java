package Exercicios;

class ResistorColor {
    enum Color{
        BLACK(0),
        BROWN(1),
        RED(2),
        ORANGE(3),
        YELLOW(4),
        GREEN(5),
        BLUE(6),
        VIOLET(7),
        GREY(8),
        WHITE(9);

        private final int encoded;

        Color(int encoded){
            this.encoded = encoded;
        }

        public int getEncoded() {
            return encoded;
        }
    }
    int colorCode(String color) {
        for (Color c:Color.values()){
            if (c.name().equals(color.toUpperCase())){
                return c.getEncoded();
            }
        } return 0;
    }

    String[] colors() {
        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return colors;
    }
}


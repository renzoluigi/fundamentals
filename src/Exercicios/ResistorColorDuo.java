package Exercicios;

class ResistorColorDuo {
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
    int value(String[] colors) {
        String result = "";
        for(String c:colors){
            for(Color color:Color.values()){
                if (color.name().equals(c.toUpperCase()) && result.length()<2){
                    result+=color.getEncoded();
                }
            }
        }return Integer.parseInt(result);
    }
}


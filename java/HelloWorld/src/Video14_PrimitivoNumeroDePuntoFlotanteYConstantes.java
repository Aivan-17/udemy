public class Video14_PrimitivoNumeroDePuntoFlotanteYConstantes {
    public static void main(String[] args){
        float realFloat=0.000015f;
        System.out.println("realFloat= "+realFloat);
        System.out.println("Float correstonde en byte a = "+Float.BYTES);
        System.out.println("Float corresponde en bytes a = "+Float.SIZE);
        System.out.println("Maximo valor para float = "+ Float.MAX_VALUE);
        System.out.println("Minimo valor para float = "+Float.MIN_VALUE);

        double realDouble=3.4028235E39;
        System.out.println("realDouble= "+realDouble);
        System.out.println("double correstonde en byte a = "+Double.BYTES);
        System.out.println("double corresponde en bytes a = "+Double.SIZE);
        System.out.println("Maximo valor para double = "+ Double.MAX_VALUE);
        System.out.println("Minimo valor para double = "+Double.MIN_VALUE);

        var varFlotante=3.1416F;
        System.out.println("varFlotante = " + varFlotante);
    }
}

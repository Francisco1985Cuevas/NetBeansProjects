package vt12;

class RevisorStrings{
    public static void main(String args[]){
        String str = "La estupidez insiste siempre";
        System.out.println("El string es: "+str);
        
        // metodos de la clase String
        System.out.println("Tamaño de este String: "+str.length());
        System.out.println("El caracter en la posicion 5: "+str.charAt(5));
        System.out.println("El subString de 3 a 12: "+str.substring(3, 12));
        System.out.println("El index del caracter z: "+str.indexOf('z'));
        System.out.println("El index del inicio del substring \"siempre\":  "+str.indexOf("siempre"));
        System.out.println("El string en mayusculas: "+str.toUpperCase());
        
    }
}
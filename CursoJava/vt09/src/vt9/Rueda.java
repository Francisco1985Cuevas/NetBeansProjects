package vt9;

class Rueda{
    public static void main(String args[]){
        // Contador de letras que mas se repiten
        String frase[] = {"TODA CUESTION TIENE DOS PUNTOS DE VISTA", 
                            "EL EQUIVOCADO Y EL NUESTRO",
                            "TODAS LAS MUJERES TIENEN ALGO HERMOSO",
                            "AUNQUE SEA UNA PRIMA LEJANA",
                            "SE ESTA MURIENDO GENTE QUE ANTES NO SE MORIA",
                            "HE OIDO HABLAR TAN BIEN DE TI",
                            "QUE CREIA QUE ESTABAS MUERTO",
                            "RECUERDA SIEMPRE QUE ERES UNICO",
                            "EXACTAMENTE IGUAL A TODOS LOS DEMAS",
                            "TODO TIEMPO PASADO FUE ANTERIOR.",
                            "LOS HONESTOS SON INADAPTADOS SOCIALES",
                            "LA VERDAD ABSOLUTA NO EXISTE",
                            "Y ESTO ES ABSOLUTAMENTE CIERTO",
                            "LO TRISTE NO ES IR AL CEMENTERIO, SINO QUEDARSE",
                            "EL AMOR ETERNO DURA APROXIMADAMENTE TRES MESES"};
        
        int contadorLetras[] = new int[26];
        
        for(int contador = 0; contador < frase.length; contador++){
            String current = frase[contador];
            char letras[] = current.toCharArray();
            for(int contador2 = 0; contador2 < letras.length; contador2++){
                char letra = letras[contador2];
                if( (letra >= 'A') && (letra <= 'Z') ){
                    contadorLetras[letra - 'A']++;
                }
            }
        }
        
        for(char contador3 = 'A'; contador3 <= 'Z'; contador3++){
            System.out.print(contador3+": "+contadorLetras[contador3 - 'A'] + " ");
        }
        
        System.out.println();
    }
}
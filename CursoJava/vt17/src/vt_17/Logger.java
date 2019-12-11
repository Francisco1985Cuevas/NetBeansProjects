package vt_17;

class Logger{
    private String formato;
    
    public String getFormat(){
        return this.formato;
    }
    
    public void setFormat(String formato){
        if( (formato.equals("admin")) || (formato.equals("OutKast")) ){
            this.formato = formato;
        }
    }
}
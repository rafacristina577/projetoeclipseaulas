package gestaobiblioteca.model;

public /*abstract*/class Usuario  {
    private int id;
    private String nome;
    
    public void setIl(int id)
       if (id < 0){
        throw new IllegalArgumentException(s: "ID dever ser número positivo.");
       } 
       this.id =id;
    
       }
        
}

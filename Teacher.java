public class  Teacher{
     private Integer id;
     private String name;
     public void setId(Integer id){
	     this.id=id;
     }
     public Integer getId(){
        return  id;
     }
     public void setName(String name){

         this.name=name;
     }
     public String getName(){

	     return name;
     }

     public String toString(){
        
	     return "Teacher [id"+this.id+"name"+this.name+"]";
     }
 
}


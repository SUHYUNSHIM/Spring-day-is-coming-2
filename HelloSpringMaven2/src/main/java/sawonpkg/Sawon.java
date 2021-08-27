package sawonpkg;

public class Sawon {//Sawon.java //VO
   private int id;
   private String irum;
   
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getIrum() {
	return irum;
}
public void setIrum(String irum) {
	this.irum = irum;
}
public String toString() { //출력전문메소드 ,overriding 
  	return  "사원의 id는 "+id+","+"사원이름은 "+irum+" 이라는~~~";
  	
	  
}   
        
}

package model;

public class Student {
private int ID = 1;
private String prova = "Pippo";


public Student(int i, String string) {
	// TODO Auto-generated constructor stub
}

public int getID() {
	return ID;
}

public void setID(int iD) {
	ID = iD;
}

public String getProva() {
	return prova;
}

public void setProva(String prova) {
	this.prova = prova;
}

public String toString(){  
    return ID+" "+prova;  
}  
}

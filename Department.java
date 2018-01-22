package hw4;
//nuri baþar 150713038
//create Department class
public class Department {
	private String name;
	private double budget;
	private int maxWorkers;
	private int currentCapacity;
	private double currentlyBudget;
	private int id ;
	private Employee[] workman;
	
	public Department(String name,double budget,int maxWorkers){//write parameter in consctructor
		this.budget = budget;
		this.maxWorkers = maxWorkers;
		this.name = name;
		setWorkers(new Employee[maxWorkers]);
		currentCapacity = this.maxWorkers;
		currentlyBudget = this.budget;
		
		
	}
	public void setMaxWorkers(int x){ //I form connection between currentCapacity and maxWorkers
		currentCapacity += x-maxWorkers; 
		System.out.println(currentCapacity);
		this.maxWorkers = x;
		System.out.println(maxWorkers);
	}
	public void increaseBudget(double q){//increasing salary with given parameter as percentage
		budget += budget*(q/100);
	}
	public void decreaseBudget(double s){//decreasing salary with given parameter as percentage
		budget -= budget*(s/100);
	}
	public void increaseCapacity(int y){//increasing number of worker with given parameter
		currentCapacity += y;
	}
	public void decreaseCapacity(int z){//decreasing number of worker capacity with given parameter
		currentCapacity -= z;
	}
	//create set and get methods of budget and budgetHW
	public void setBudget(double a){
		currentlyBudget += a;
	}
	public void setBudgetHW(double a){
		currentlyBudget -= a;
	}
	public boolean fireEmployee(Employee f){//firing employer given as parameter also consider capacity of department and budget of department
		
	if(!ekle(f)){
		
	}
	else{
	cýkar(f);	
	setBudget(f.getSalary());
	
	}
		return true;	
	}
	public  boolean  hireEmployee(Employee f){//hiring employer given as parameter and  consider capacity of department and budget of department
		
		if(currentCapacity >0 && currentlyBudget >= f.getSalary()){
		
			if(ekle(f)){
				
			return false;
		}
		else{
			currentCapacity-=1;
			setBudgetHW(f.getSalary());
			expletive(f);
			System.out.println("hire succesfull"+" "+f.getName()+" "+f.getSalary());

			
			return true;
		}}
		else if(currentCapacity <= 0 ){
			
			return false;
		}
		else if(currentlyBudget < f.getSalary() ){
			
			return false;
		}
		return false;
	}


	
public Employee[] getEmployees(){
	return workman;
}
public Employee[] getEmployees(double salary, boolean order){
	Employee[] ptt = new Employee[maxWorkers];
	int w=0;
	if(order){
	for(int a=0;a<workman.length;a++){
		if(workman[a].getSalary()>salary){
			workman[a]=ptt[w];w++;
			
		}
	}
	}
	if(order!=true){
		for(int a=0;a<workman.length;a++){
			if(workman[a].getSalary()<salary){
				workman[a]=ptt[w];w++;
			}
		}
		}
	return ptt;
}
public Employee[] getEmployees(int age, boolean order){
	Employee[] smp = new Employee[maxWorkers];
	int k=0;
	if(order=true){
	for(int c=0;c<workman.length;c++){
		if(workman[c] != null){
		if(workman[c].getAge() > age){
			smp[k]=workman[c];
			k++;
		}
	}
		}
	}
	if(order=false){
		for(int c=0;c<workman.length;c++){
			if(workman[c] != null){
			if(workman[c].getAge() < age){
				smp[k]=workman[c];
				k++;
			}
		}
			}
		}return smp;
}
public Employee[] sort(Employee[] is , boolean order){
	if(order==true)
		return is;
	else
return workman;



}//I equate budget,ýd ,name,max capacity and currently capacity  to string and return
public String toString(){
	String hepsi;
	hepsi= "Department ID: "+id+"\n"+"Department Name: "+name+"\n"+"Department Budget: "+budget+"\n"+"Department Max Capacity: "+maxWorkers+"\n"+"Department Current Capacity: "+currentCapacity;
	return hepsi;
	
}
public boolean ekle(Employee r){
boolean nuri = false;
	for(int a=0;a<workman.length;a++){
		if(workman[a] == r){ 
			nuri= true;
		}
		}
	return nuri;
}
//create expletive method 
public void expletive(Employee r){
	for(int a=0;a<workman.length;a++){
		if(workman[a] == null){
			
			workman[a]=r;
			break;
		}}
}
//control worker in Employee array or not
public void cýkar(Employee r){
	for(int a=0;a<workman.length;a++){
		if(workman[a] == r){
			
			workman[a]=null;
			break;
		}}
}

public void setWorkers(Employee[] workers) {//Returns all employers of departments in array
	this.workman = workers;
}
}

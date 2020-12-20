//package sourceFiles.classes;

public class Sale{
	private int saleId;
	private int medId;
	private String medName;
	private double unitPrice;
	private int purchasedQuantity;
	private double amount;
	//private double totalAmount=0;
	
	public Sale(){}
	
	public Sale(int saleId, int medId, String medName, int quantity, double unitPrice, double amount){
	//public Sale(int saleId, String medName, int quantity, double unitPrice, double amount){

		this.saleId=saleId;
		this.medId=medId;
		this.medName=medName;
		this.purchasedQuantity=quantity;
		this.unitPrice=unitPrice;
		this.amount=amount;
	}
	
	public void setSaleId(int saleId){
		this.saleId = saleId;
	}
	
	public int getSaleId(){
		return this.saleId;
	}
	
	public void setMedId(int medId){
		this.medId = medId;
	}
	
	public int getMedId(){
		return this.medId;
	}
	
	public void setMedName(String medName){
		this.medName = medName;
	}
	
	public String getMedName(){
		return this.medName;
	}
	
	public void setUnitPrice(double unitPrice){
		this.unitPrice = unitPrice;
	}
	
	public double getUnitPrice(){
		return this.unitPrice;
	}
	
	public void setPurchasedQuantity(int quantity){
		this.purchasedQuantity = quantity;
	}
	
	public int getPurchasedQuantity(){
		return this.purchasedQuantity;
	}
	
	public void setAmount(double amount){
		this.amount = amount;
	}
	
	public double getAmount(){
		return this.amount;
	}
	
	/*public void setTotalAmount(double totalAmount){
		this.totalAmount = totalAmount;
	}
	
	public double getTotalAmount(){
		return this.totalAmount;
	}*/

	/*public Medicine addToCart(Medicine med){
		for(int i=0;i<medicines.length;i++){
			if(medicines[i]==null){
				medicines[i]=med;
				amount = med.getQuantity() * med.getUnitPrice();
				totalAmount = totalAmount + amount;
				break;
			}
		}
	}
	
	public Medicine removeFromCart(Medicine id){
		for(int i=0;i<medicines.length;i++){
			if(medicines[i]!=null){
				if(medicines[i].medId == id){
					medicines[i]=null;
					amount = med.getQuantity() * med.getUnitPrice();
					totalAmount = totalAmount - amount;
					break;
				}
			}
		}
	}*/
}
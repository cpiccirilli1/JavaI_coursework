package acctpkg;
public class Account{
	private String acctNum = "null";
	private String acctType = "null";
	private String cardNo = "null";
	private String expDate = "null";

	public void Account(String newAcctNum, String newAcctType, String card, String exp){
		this.acctNum = newAcctNum;
		this.acctType = newAcctType;
		this.cardNo = card; 
		this.expDate = exp; 
	}

	public void setAcctNum (String newAcctNum){
		this.acctNum = newAcctNum; 
	}
	public void setAcctType(String newAcctType){
		this.acctType = newAcctType;
	}
	public void setCardNo(String card){
		this.cardNo = card;
	}
	public void setExp(String exp){
		this.expDate = exp;
	}

	public String getAcctNum(){
		return acctNum;
	}
	public String getAcctType(){
		return acctType;
	}
	public String getCardNo(){
		return cardNo;
	}
	public String getExp(){
		return expDate;
	}
}
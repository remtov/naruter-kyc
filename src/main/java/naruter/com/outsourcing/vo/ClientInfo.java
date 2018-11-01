package naruter.com.outsourcing.vo;

import org.apache.ibatis.type.Alias;

@Alias("ci")
public class ClientInfo {
	private Integer membernum;
	private String companyname;
	private String companyregistrationnumber;
	private String companyaddress;
	private String compantype;
	private String businessvariety;
	private String companyslte;
	
	public ClientInfo(Integer membernum, String companyname, String companyregistrationnumber, String companyaddress,
			String compantype, String businessvariety, String companyslte) {
		super();
		this.membernum = membernum;
		this.companyname = companyname;
		this.companyregistrationnumber = companyregistrationnumber;
		this.companyaddress = companyaddress;
		this.compantype = compantype;
		this.businessvariety = businessvariety;
		this.companyslte = companyslte;
	}
	
	public ClientInfo() {
		
	}
	
	public Integer getMembernum() {
		return membernum;
	}
	public void setMembernum(Integer membernum) {
		this.membernum = membernum;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCompanyregistrationnumber() {
		return companyregistrationnumber;
	}
	public void setCompanyregistrationnumber(String companyregistrationnumber) {
		this.companyregistrationnumber = companyregistrationnumber;
	}
	public String getCompanyaddress() {
		return companyaddress;
	}
	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}
	public String getCompantype() {
		return compantype;
	}
	public void setCompantype(String compantype) {
		this.compantype = compantype;
	}
	public String getBusinessvariety() {
		return businessvariety;
	}
	public void setBusinessvariety(String businessvariety) {
		this.businessvariety = businessvariety;
	}
	public String getCompanyslte() {
		return companyslte;
	}
	public void setCompanyslte(String companyslte) {
		this.companyslte = companyslte;
	}
	@Override
	public String toString() {
		return "ClientInfo [membernum=" + membernum + ", companyname=" + companyname + ", companyregistrationnumber="
				+ companyregistrationnumber + ", companyaddress=" + companyaddress + ", compantype=" + compantype
				+ ", businessvariety=" + businessvariety + ", companyslte=" + companyslte + "]";
	}

}

package naruter.com.outsourcing.vo;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

@Alias("ci")
public class ClientInfo {

	private Integer membernum;
	private String companyname; /*회사이름*/
	private String companynumber; /*사업자번호*/
	private String companyaddress; /*회사 주소*/
	private String companytype /*기업형태 -> 공공기업, 중소기업 등등*/;
	private String companysite /*회사 홈페이지*/;
	
	public ClientInfo() {}
	public ClientInfo(Integer membernum, String companyname, String companynumber, String companyaddress,
			String companytype, String companysite) {
		super();
		this.membernum = membernum;
		this.companyname = companyname;
		this.companynumber = companynumber;
		this.companyaddress = companyaddress;
		this.companytype = companytype;
		this.companysite = companysite;
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
	public String getCompanynumber() {
		return companynumber;
	}
	public void setCompanynumber(String companynumber) {
		this.companynumber = companynumber;
	}
	public String getCompanyaddress() {
		return companyaddress;
	}
	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}
	public String getCompanytype() {
		return companytype;
	}
	public void setCompanytype(String companytype) {
		this.companytype = companytype;
	}
	public String getCompanysite() {
		return companysite;
	}
	public void setCompanysite(String companysite) {
		this.companysite = companysite;
	}
	@Override
	public String toString() {
		return "ClientInfo [membernum=" + membernum + ", companyname=" + companyname + ", companynumber="
				+ companynumber + ", companyaddress=" + companyaddress + ", companytype=" + companytype
				+ ", companysite=" + companysite + "]";
	}
	
	
}

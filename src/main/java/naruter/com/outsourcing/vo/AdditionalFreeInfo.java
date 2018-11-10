package naruter.com.outsourcing.vo;

import org.apache.ibatis.type.Alias;

@Alias("afi")
public class AdditionalFreeInfo {
	private Integer additionalnum;
	private Integer membernum; /*freelancer의 membernum에 forign key*/
	private char additionaltype; 
	/*1 : 학력
	2 : 경력
	3 : 자격증은 enddate - 000000*/
	private String additionaltitle;
	private String additionalstdate; /*년 월*/
	private String additionalenddate; /*년 월*/
	
	public AdditionalFreeInfo() {}

	public AdditionalFreeInfo(Integer additionalnum, Integer membernum, char additionaltype, String additionaltitle,
			String additionalstdate, String additionalenddate) {
		super();
		this.additionalnum = additionalnum;
		this.membernum = membernum;
		this.additionaltype = additionaltype;
		this.additionaltitle = additionaltitle;
		this.additionalstdate = additionalstdate;
		this.additionalenddate = additionalenddate;
	}

	public Integer getAdditionalnum() {
		return additionalnum;
	}

	public void setAdditionalnum(Integer additionalnum) {
		this.additionalnum = additionalnum;
	}

	public Integer getMembernum() {
		return membernum;
	}

	public void setMembernum(Integer membernum) {
		this.membernum = membernum;
	}

	public char getAdditionaltype() {
		return additionaltype;
	}

	public void setAdditionaltype(char additionaltype) {
		this.additionaltype = additionaltype;
	}

	public String getAdditionaltitle() {
		return additionaltitle;
	}

	public void setAdditionaltitle(String additionaltitle) {
		this.additionaltitle = additionaltitle;
	}

	public String getAdditionalstdate() {
		return additionalstdate;
	}

	public void setAdditionalstdate(String additionalstdate) {
		this.additionalstdate = additionalstdate;
	}

	public String getAdditionalenddate() {
		return additionalenddate;
	}

	public void setAdditionalenddate(String additionalenddate) {
		this.additionalenddate = additionalenddate;
	}

	@Override
	public String toString() {
		return "AdditionalFreeInfo [additionalnum=" + additionalnum + ", membernum=" + membernum + ", additionaltype="
				+ additionaltype + ", additionaltitle=" + additionaltitle + ", additionalstdate=" + additionalstdate
				+ ", additionalenddate=" + additionalenddate + "]";
	}
	
	
}

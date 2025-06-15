package model.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component(value="memObj")
@Scope("prototype")
public class Member {
	@Value("108")
	private long memberId;
	@Value("gold member")
	private String memberType;
	@Value("23224")
	private long memberPhone;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Autowired
	private Customer customer;
	
	public long getMemberId() {
		return memberId;
	}
	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	public long getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(long memberPhone) {
		this.memberPhone = memberPhone;
	}
	
	
	
	
}

package user;

import java.math.BigDecimal;

public enum UserStatus {
	
	REGULAR(0.0f), BRONZE(0.03f), SILVER(0.05f), GOLD(0.1f), PLATINUM(0.15f);
	
	private float initialDiscount;

	UserStatus(float initialDiscount) {
		this.initialDiscount = initialDiscount;
	}

	public BigDecimal getInitialDiscount() {
		return new BigDecimal(initialDiscount);
	}

}

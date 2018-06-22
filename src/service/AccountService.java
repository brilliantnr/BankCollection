package service;

import java.util.*;
import domain.*;

public interface AccountService {
	public void createAccount(AccountBean ac);
	public void createMinusAccount(MinusAccountBean minusAc);
	
	public AccountBean findById(AccountBean ac);
	public void updatePw(AccountBean ac);
	public void deleteAccount(AccountBean ac);
}

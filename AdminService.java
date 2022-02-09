package com.example.PracticeOfSpringBoot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class AdminService {
	@Autowired
	public AdminRepo ar;
	@Autowired 
	public DealerRepo dr;
	@Autowired
	public UserRepo ur;
	
	//Admin login
	public String adminLogIn(String username)
	{
		String un=ar.findById(username).get().getUsername();
		return un;
	}
	
	//Adding Dealer
	public void adminAddDealer(Dealer d)
	{
		dr.save(d);
	}

	//Viewing Dealer
	public List<Dealer> adminDisplayDealer()
	{
		List <Dealer> d=new ArrayList<Dealer>();
		dr.findAll().forEach(dealer -> d.add(dealer));
		return d;
	}
	
	//Viewing User
	public List<User> adminDisplayUser()
	{
		List <User> d=new ArrayList<User>();
		ur.findAll().forEach(User -> d.add(User));
		return d;
	}
	
	//Update Dealer Address.
	public void adminUpdateDealerAddress(String dealerName,String dealerAddress)
	{
		Dealer dn=new Dealer();
		dn.setUsername(dr.findById(dealerName).get().getUsername());
		dn.setDealershipName(dr.findById(dealerName).get().getDealershipName());
		dn.setDealershipAddress(dealerAddress);
		dn.setEmail(dr.findById(dealerName).get().getEmail());
		dn.setPhno(dr.findById(dealerName).get().getPhno());
		dn.setPassword(dr.findById(dealerName).get().getPassword());
		dr.deleteById(dealerName);
		dr.save(dn);
	}
	
	//Deleting Dealer
	public boolean adminDeleteDealer(String dealerName, String dealershipName)
	{
		if(dr.findById(dealerName).isPresent())
		{
			if(dr.findById(dealershipName).isPresent())
			{
				dr.deleteById(dealerName);
				return true;
			}
			else
				return false;
		}
		else
			return false;
	}
	
	//Deleting User
	public boolean adminDeleteUser(String username)
	{
		if(ur.findById(username).isPresent())
		{
			ur.deleteById(username);
			return true;
		}
		else
			return false;
	}
}

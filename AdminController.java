package com.example.PracticeOfSpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AdminController {

	@Autowired
	public AdminService as;

	// Admin login
	@RequestMapping("/admin/adminLogIn/{username}/{password}")
	@ResponseBody
	public String adminLogIn(@PathVariable String username, @PathVariable String password) {
		if (password.equals(as.adminLogIn(username)))
			return "Admin sign-in success.";
		else
			return "Admin sign-in failure.";
	}

	// Admin add dealer
	@RequestMapping("/admin/adminAddDealer")
	@ResponseBody
	public String adminAddDealer(@RequestBody Dealer d) {
		as.adminAddDealer(d);
		return "Dealer added successfully.";
	}

	// Admin view dealers
	@RequestMapping("/admin/adminViewDealers")
	@ResponseBody
	public List<Dealer> adminViewDealer() {
		return as.adminDisplayDealer();
	}

	// Admin view users
	@RequestMapping("/admin/adminViewUsers")
	@ResponseBody
	public List<User> adminViewUser() {
		return as.adminDisplayUser();
	}

	// Admin update dealer
	@PutMapping("/admin/adminUpdateDealerAddress/{dealerName}/{dealerAddress}")
	@ResponseBody
	public String adminUpdateRating(@PathVariable String dealerName, @PathVariable String dealerAddress) {
		as.adminUpdateDealerAddress(dealerName, dealerAddress);
		return "Dealer Addess updated.";
	}

	// Admin delete dealer
	@DeleteMapping("/admin/adminDeleteUser/{userName}/(dealershipName)")
	@ResponseBody
	public String adminDeleteDealer(@PathVariable String userName, @PathVariable String dealershipName) {
		if (as.adminDeleteDealer(userName, dealershipName))
			return "user deleted successfully.";
		else
			return "user deletion failure";
	}

	// Admin delete user
	@DeleteMapping("/admin/adminDeleteUser/{userName}")
	@ResponseBody
	public String adminDeleteUser(@PathVariable String userName) {
		if (as.adminDeleteUser(userName))
			return "user deleted successfully.";
		else
			return "user deletion failure";
	}

}

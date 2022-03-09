package com.org.address.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressResource {
	

	@GetMapping(value = "/{empId}")
	public Address getEmployeeDetails(@PathVariable int empId) {

		List<Address> addressList = getAllAddresses();
		Address addressReturn = new Address();

		for (Address address : addressList) {
			if (address.getEmpId() == empId) {
				addressReturn = address;
			}
		}
		return addressReturn;
	}

	public List<Address> getAllAddresses() {
		List<Address> addressList = new ArrayList<Address>();

		Address address = new Address(1, "402,Lotus Aditya Apartments", "KPHB, Kukatpally", "Hyderabad", "TS", "500072",
				1);
		addressList.add(address);
		 address = new Address(1, "101, ABC Apartments", "KPHB, Kukatpally", "Hyderabad", "TS", "500072",
				2);
		 addressList.add(address);

		return addressList;
	}

}

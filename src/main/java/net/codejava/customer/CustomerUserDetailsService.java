package net.codejava.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomerUserDetailsService implements UserDetailsService {

	@Autowired private LibrarianRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Librarian customer = repo.findByEmail(email);
		if (customer == null) {
			throw new UsernameNotFoundException("No customer found with the given email.");
		}
		
		return new CustomLibrarianDetails(customer);
	}

}

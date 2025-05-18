package com.nt2311.ecommerce.customer;

import com.nt2311.ecommerce.exception.CustomerNotFoundException;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

/** CustomerService */
@Service
@RequiredArgsConstructor
public class CustomerService {
  private final CustomerRepository repository;
  private final CustomerMapper mapper;

  public String createCustomer(CustomerRequest request) {
    var customer = repository.save(mapper.toCustomer(request));
    return customer.getId();
  }

  public void updateCustomer(CustomerRequest request) {
    var customer = repository
        .findById(request.id())
        .orElseThrow(
            () -> new CustomerNotFoundException(
                String.format(
                    "Cannot update customer:: No customer found with the provided ID:: %s",
                    request.id())));

    mergerCustomer(customer, request);
    repository.save(customer);
  }

  private void mergerCustomer(Customer customer, CustomerRequest request) {
    if (StringUtils.isNotBlank(request.firstName())) {
      customer.setFirstName(request.firstName());
    }
  }
}

package com.nt2311.ecommerce.exception;

/** CustomerNotFoundException */
public class CustomerNotFoundException extends RuntimeException {
  private final String msg;

  public CustomerNotFoundException(String msg) {
    super(msg);
    this.msg = msg;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    CustomerNotFoundException that = (CustomerNotFoundException) o;

    return msg != null ? msg.equals(that.msg) : that.msg == null;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 + result + (msg != null ? msg.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "[msg=" + msg + "]";
  }
}

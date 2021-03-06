package com.customertracker.CustomerTracker.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class models a Customer's account.
 */
@Entity
@Table(name = "accounts")
public class Account {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private Integer customer_id;

  private String address;

  private String city;

  private String state;

  private Integer zip_code;

  private Integer solar_farm_id;

  private double capacity_share;

  private String created_date;

  /**
   * Constructor constructs an Account object with all null or negative values representing an
   * empty account.
   */
  public Account() {
    this.customer_id = null;
    this.address = null;
    this.city = null;
    this.state = null;
    this.zip_code = null;
    this.solar_farm_id = null;
    this.capacity_share = -.01;
    this.created_date = null;
  }

  /**
   * Constructor constructs an Account object and initializes all class variables according to the
   * passed in parameters.
   *
   * @param customerId an Integer representing the customer identification number for the customer who
   *                owns the constructed Account object.
   * @param address a String representing the address of the associated Account object.
   * @param city a String representing the city of the associated Account object.
   * @param state a String representing the state of the associated Account object.
   * @param zipCode an Integer representing the zip code for the associated Account object.
   * @param solarFarmId an Integer representing the ID for the associated Solar Farm of the Account
   *                    object.
   * @param capacityShare a double representing the capacity return from the associated solar farm
   *                      for the Account object.
   * @param createdDate a String representing the date the Account was created.
   */
  public Account(Integer customerId, String address, String city, String state, Integer zipCode,
                 Integer solarFarmId, double capacityShare, String createdDate) {
    this.customer_id = customerId;
    this.address = address;
    this.city = city;
    this.state = state;
    this.zip_code = zipCode;
    this.solar_farm_id = solarFarmId;
    this.capacity_share = capacityShare;
    this.created_date = createdDate;
  }

  /**
   * This method returns the Account object's ID.
   *
   * @return an Integer representing the Account's ID.
   */
  public Integer getId() {
    return id;
  }

  /**
   * This method sets the Account object's ID. This method does not work as the ID is auto
   * generated by the MySQL server.
   *
   * @param id an Integer representing the Account's ID.
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * This method returns the Account object's customer identification number.
   *
   * @return an Integer representing the Customer's identification number.
   */
  public Integer getCustomer_id() {
    return customer_id;
  }

  /**
   * This method sets the Account object's customer identification number according to the passed
   * parameter.
   *
   * @param customerId an Integer representing the Customer's identification number.
   */
  public void setCustomer_id(Integer customerId) {
    this.customer_id = customerId;
  }

  /**
   * This method returns the Account object's address.
   *
   * @return a String that represents the address the account is located at.
   */
  public String getAddress() {
    return address;
  }

  /**
   * This method sets the Account object's address variable according to the passed parameter.
   *
   * @param address a String that represents the address the account is located at.
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * This method returns the Account object's city.
   *
   * @return a String that represents the city the account is located at.
   */
  public String getCity() {
    return city;
  }

  /**
   * This method sets the Account object's city variable according to the passed parameter.
   *
   * @param city a String that represents the city that the Account is located in.
   */
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * This method returns the Account object's State.
   *
   * @return a String that represents the State the account is located in.
   */
  public String getState() {
    return state;
  }

  /**
   * This method sets the Account object's state variable according to the passed parameter.
   *
   * @param state a String that represents the State that the Account is located in.
   */
  public void setState(String state) {
    this.state = state;
  }

  /**
   * This method returns the Account object's zip code.
   *
   * @return a String that represents the zip code the account is located in.
   */
  public Integer getZip_code() {
    return zip_code;
  }

  /**
   * This method sets the Account object's zip code variable according to the passed parameter.
   *
   * @param zip_code an Integer that represents the account's zip code.
   */
  public void setZip_code(Integer zip_code) {
    this.zip_code = zip_code;
  }

  /**
   * This method returns the Account object's solar-farm-id number.
   *
   * @return an Integer that represents the Account's associated solar-farm-id
   */
  public Integer getSolar_farm_id() {
    return solar_farm_id;
  }

  /**
   * This method sets the Account object's solar-farm-id variable according to the passed parameter.
   *
   * @param solar_farm_id an Integer that represents the Account's associated solar-farm-id.
   */
  public void setSolar_farm_id(Integer solar_farm_id) {
    this.solar_farm_id = solar_farm_id;
  }

  /**
   * This method returns the Account object's capacity share.
   *
   * @return a double that represents the Account's capacity share.
   */
  public double getCapacity_share() {
    return capacity_share;
  }

  /**
   * This method sets the Account object's capacity share variable according to the passed parameter.
   *
   * @param capacity_share a double that represents the Account's capacity share.
   */
  public void setCapacity_share(double capacity_share) {
    this.capacity_share = capacity_share;
  }

  /**
   * This method returns the Account object's creation date.
   *
   * @return a String that represents the Account's date of creation.
   */
  public String getCreated_date() {
    return created_date;
  }

  /**
   * This method sets the Account object's created date variable according to the passed parameter.
   *
   * @param created_date a String that represents the Account's date of creation.
   */
  public void setCreated_date(String created_date) {
    this.created_date = created_date;
  }
}

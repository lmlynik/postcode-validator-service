package pl.mlynik.models;


import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("postcodes")
public class Postcode {

    @Id
    private String id;
    private String households;
    private String districtCode;
    private String latitude;
    private String countyCode;
    private String postcodeCleaned;
    private String population;
    private String postcode;
    private String builtUpSubDivision;
    private String wardCode;
    private String easting;
    private String northing;
    private String country;
    private String longitude;
    private String nationalPark;
    private String county;
    private String ward;
    private String constituency;
    private String terminated;
    private String lowerLayerSuperOutputArea;
    private String district;
    private String introduced;
    private String gridRef;
    private String builtUpArea;
    private String parish;

    public String getHouseholds() {
        return households;
    }

    public void setHouseholds(String households) {
        this.households = households;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getPostcodeCleaned() {
        return postcodeCleaned;
    }

    public void setPostcodeCleaned(String postcodeCleaned) {
        this.postcodeCleaned = postcodeCleaned;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getBuiltUpSubDivision() {
        return builtUpSubDivision;
    }

    public void setBuiltUpSubDivision(String builtUpSubDivision) {
        this.builtUpSubDivision = builtUpSubDivision;
    }

    public String getWardCode() {
        return wardCode;
    }

    public void setWardCode(String wardCode) {
        this.wardCode = wardCode;
    }

    public String getEasting() {
        return easting;
    }

    public void setEasting(String easting) {
        this.easting = easting;
    }

    public String getNorthing() {
        return northing;
    }

    public void setNorthing(String northing) {
        this.northing = northing;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getNationalPark() {
        return nationalPark;
    }

    public void setNationalPark(String nationalPark) {
        this.nationalPark = nationalPark;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getConstituency() {
        return constituency;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }

    public String getTerminated() {
        return terminated;
    }

    public void setTerminated(String terminated) {
        this.terminated = terminated;
    }

    public String getLowerLayerSuperOutputArea() {
        return lowerLayerSuperOutputArea;
    }

    public void setLowerLayerSuperOutputArea(String lowerLayerSuperOutputArea) {
        this.lowerLayerSuperOutputArea = lowerLayerSuperOutputArea;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getIntroduced() {
        return introduced;
    }

    public void setIntroduced(String introduced) {
        this.introduced = introduced;
    }

    public String getGridRef() {
        return gridRef;
    }

    public void setGridRef(String gridRef) {
        this.gridRef = gridRef;
    }

    public String getBuiltUpArea() {
        return builtUpArea;
    }

    public void setBuiltUpArea(String builtUpArea) {
        this.builtUpArea = builtUpArea;
    }

    public String getParish() {
        return parish;
    }

    public void setParish(String parish) {
        this.parish = parish;
    }
}
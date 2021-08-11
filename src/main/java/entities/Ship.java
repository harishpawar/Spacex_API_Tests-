package entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Ship {
    public Object legacy_id;
    public Object model;
    public String type;
    public List<String> roles;
    public int imo;
    public int mmsi;

    public int getClassName() {
        return className;
    }

    public void setClassName(int className) {
        this.className = className;
    }

    @JsonProperty("class")
    public int className;
    public int abs;
    public int mass_kg;
    public int mass_lbs;
    public int year_built;
    public String home_port;
    public Object status;
    public Object speed_kn;
    public Object course_deg;
    public Object latitude;
    public Object longitude;
    public Object last_ais_update;
    public String link;
    public String image;
    public List<String> launches;
    public String name;
    public boolean active;
    public String id;

    public Object getLegacy_id() {
        return legacy_id;
    }

    public void setLegacy_id(Object legacy_id) {
        this.legacy_id = legacy_id;
    }

    public Object getModel() {
        return model;
    }

    public void setModel(Object model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public int getImo() {
        return imo;
    }

    public void setImo(int imo) {
        this.imo = imo;
    }

    public int getMmsi() {
        return mmsi;
    }

    public void setMmsi(int mmsi) {
        this.mmsi = mmsi;
    }

    public int getAbs() {
        return abs;
    }

    public void setAbs(int abs) {
        this.abs = abs;
    }

    public int getMass_kg() {
        return mass_kg;
    }

    public void setMass_kg(int mass_kg) {
        this.mass_kg = mass_kg;
    }

    public int getMass_lbs() {
        return mass_lbs;
    }

    public void setMass_lbs(int mass_lbs) {
        this.mass_lbs = mass_lbs;
    }

    public int getYear_built() {
        return year_built;
    }

    public void setYear_built(int year_built) {
        this.year_built = year_built;
    }

    public String getHome_port() {
        return home_port;
    }

    public void setHome_port(String home_port) {
        this.home_port = home_port;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public Object getSpeed_kn() {
        return speed_kn;
    }

    public void setSpeed_kn(Object speed_kn) {
        this.speed_kn = speed_kn;
    }

    public Object getCourse_deg() {
        return course_deg;
    }

    public void setCourse_deg(Object course_deg) {
        this.course_deg = course_deg;
    }

    public Object getLatitude() {
        return latitude;
    }

    public void setLatitude(Object latitude) {
        this.latitude = latitude;
    }

    public Object getLongitude() {
        return longitude;
    }

    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

    public Object getLast_ais_update() {
        return last_ais_update;
    }

    public void setLast_ais_update(Object last_ais_update) {
        this.last_ais_update = last_ais_update;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<String> getLaunches() {
        return launches;
    }

    public void setLaunches(List<String> launches) {
        this.launches = launches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

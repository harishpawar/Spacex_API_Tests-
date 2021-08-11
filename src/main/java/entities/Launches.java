package entities;

import java.util.Date;
import java.util.List;


public class Launches {
    public Fairings fairings;
    public Links links;
    public Date static_fire_date_utc;
    public int static_fire_date_unix;
    public boolean net;
    public int window;
    public String rocket;
    public boolean success;
    public List<Failures> failures;
    public String details;
    public List<Crew> crew;
    public List<String> ships;
    public List<String> capsules;
    public List<String> payloads;
    public String launchpad;
    public boolean auto_update;
    public int flight_number;
    public String name;
    public Date date_utc;
    public int date_unix;
    public Date date_local;
    public String date_precision;
    public boolean upcoming;
    public List<Core> cores;
    public String id;

    public String getLaunch_library_id() {
        return launch_library_id;
    }

    public void setLaunch_library_id(String launch_library_id) {
        this.launch_library_id = launch_library_id;
    }

    public String launch_library_id;

    public boolean isTbd() {
        return tbd;
    }

    public void setTbd(boolean tbd) {
        this.tbd = tbd;
    }

    public boolean tbd;



    public Fairings getFairings() {
        return fairings;
    }

    public void setFairings(Fairings fairings) {
        this.fairings = fairings;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Date getStatic_fire_date_utc() {
        return static_fire_date_utc;
    }

    public void setStatic_fire_date_utc(Date static_fire_date_utc) {
        this.static_fire_date_utc = static_fire_date_utc;
    }

    public int getStatic_fire_date_unix() {
        return static_fire_date_unix;
    }

    public void setStatic_fire_date_unix(int static_fire_date_unix) {
        this.static_fire_date_unix = static_fire_date_unix;
    }


    public boolean isNet() {
        return net;
    }

    public void setNet(boolean net) {
        this.net = net;
    }

    public int getWindow() {
        return window;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public String getRocket() {
        return rocket;
    }

    public void setRocket(String rocket) {
        this.rocket = rocket;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<Failures> getFailures() {
        return failures;
    }

    public void setFailures(List<Failures> failures) {
        this.failures = failures;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<Crew> getCrew() {
        return crew;
    }

    public void setCrew(List<Crew> crew) {
        this.crew = crew;
    }

    public List<String> getShips() {
        return ships;
    }

    public void setShips(List<String> ships) {
        this.ships = ships;
    }

    public List<String> getCapsules() {
        return capsules;
    }

    public void setCapsules(List<String> capsules) {
        this.capsules = capsules;
    }

    public List<String> getPayloads() {
        return payloads;
    }

    public void setPayloads(List<String> payloads) {
        this.payloads = payloads;
    }

    public String getLaunchpad() {
        return launchpad;
    }

    public void setLaunchpad(String launchpad) {
        this.launchpad = launchpad;
    }

    public boolean isAuto_update() {
        return auto_update;
    }

    public void setAuto_update(boolean auto_update) {
        this.auto_update = auto_update;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate_utc() {
        return date_utc;
    }

    public void setDate_utc(Date date_utc) {
        this.date_utc = date_utc;
    }

    public int getDate_unix() {
        return date_unix;
    }

    public void setDate_unix(int date_unix) {
        this.date_unix = date_unix;
    }

    public Date getDate_local() {
        return date_local;
    }

    public void setDate_local(Date date_local) {
        this.date_local = date_local;
    }

    public String getDate_precision() {
        return date_precision;
    }

    public void setDate_precision(String date_precision) {
        this.date_precision = date_precision;
    }

    public boolean isUpcoming() {
        return upcoming;
    }

    public void setUpcoming(boolean upcoming) {
        this.upcoming = upcoming;
    }

    public List<Core> getCores() {
        return cores;
    }

    public void setCores(List<Core> cores) {
        this.cores = cores;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}

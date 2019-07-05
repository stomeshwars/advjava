/*
 * package com.tutorialspoint.xml;
 * 
 * public class Snippet { Instant date = null; Date sdf = null; String
 * formatTemplate = "EEE MMM dd yyyy HH:mm:ss"; try { SimpleDateFormat isoFormat
 * = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss");
 * isoFormat.setTimeZone(TimeZone.getTimeZone(ZoneId.of("US/Pacific"))); sdf =
 * isoFormat.parse(timeAtWhichToMakeAvailable); date = sdf.toInstant();
 * 
 * } catch (Exception e) { System.out.println("did not parse: " +
 * timeAtWhichToMakeAvailable); }
 * 
 * LOGGER.info("timeAtWhichToMakeAvailable: " + timeAtWhichToMakeAvailable);
 * LOGGER.info("sdf: " + sdf); LOGGER.info("parsed to: " + date); }
 * 
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.app;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author armena
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataModel implements Serializable{
    
    private Long id =System.currentTimeMillis();
    private String data = "{\n" +
"  \"_id\" : ObjectId(\"5c581ac0d35f4b0001d496a2\"),\n" +
"  \"_class\" : \"com.optym.marketplace.request.model.TokenizedResponseMessage\",\n" +
"  \"output\" : {\n" +
"    \"tripplans\" : [{\n" +
"        \"_id\" : NumberLong(392),\n" +
"        \"initialHos\" : {\n" +
"          \"remainingDuty\" : 840.0,\n" +
"          \"remainingDrive\" : 660.0,\n" +
"          \"remainingWeekly\" : 4200.0,\n" +
"          \"remainingBCP\" : 480.0\n" +
"        },\n" +
"        \"kpis\" : {\n" +
"          \"objectiveValue\" : -18628.420611111113,\n" +
"          \"violations\" : 2,\n" +
"          \"milage\" : 1442.578,\n" +
"          \"hos\" : {\n" +
"            \"remainingDuty\" : 810.0,\n" +
"            \"remainingDrive\" : 660.0,\n" +
"            \"remainingWeekly\" : 2431.3333333333335,\n" +
"            \"remainingBCP\" : 480.0\n" +
"          },\n" +
"          \"buffer\" : {\n" +
"            \"initialBuffer\" : 0.0\n" +
"          }\n" +
"        },\n" +
"        \"details\" : {\n" +
"          \"start\" : ISODate(\"2019-02-04T10:58:08.618Z\"),\n" +
"          \"end\" : ISODate(\"2019-02-06T22:56:48.618Z\")\n" +
"        },\n" +
"        \"loads\" : [{\n" +
"            \"loadId\" : \"5c3864835597fd0001d50adf\",\n" +
"            \"details\" : {\n" +
"              \"start\" : ISODate(\"2019-02-04T10:58:08.618Z\"),\n" +
"              \"end\" : ISODate(\"2019-02-06T22:56:48.618Z\")\n" +
"            },\n" +
"            \"kpis\" : {\n" +
"              \"violations\" : 2,\n" +
"              \"milage\" : 1442.578,\n" +
"              \"tripMilage\" : 1442.578,\n" +
"              \"hos\" : {\n" +
"                \"remainingDuty\" : 810.0,\n" +
"                \"remainingDrive\" : 660.0,\n" +
"                \"remainingWeekly\" : 2431.3333333333335,\n" +
"                \"remainingBCP\" : 480.0\n" +
"              },\n" +
"              \"buffer\" : {\n" +
"                \"initialBuffer\" : 0.0\n" +
"              },\n" +
"              \"deadhead\" : {\n" +
"                \"estDutyMinutes\" : 0.0,\n" +
"                \"estDriveMinutes\" : 0.0\n" +
"              }\n" +
"            },\n" +
"            \"stops\" : [{\n" +
"                \"stopId\" : NumberLong(1),\n" +
"                \"details\" : {\n" +
"                  \"start\" : ISODate(\"2019-02-04T10:58:08.618Z\"),\n" +
"                  \"end\" : ISODate(\"2019-02-05T18:07:47.618Z\"),\n" +
"                  \"routeId\" : \"DEFAULT\"\n" +
"                },\n" +
"                \"kpis\" : {\n" +
"                  \"volutionMinutes\" : 33508.78333333333,\n" +
"                  \"earlyVolutionMinutes\" : 0.0,\n" +
"                  \"milage\" : 943.8829999999999,\n" +
"                  \"loadMilage\" : 943.8829999999999,\n" +
"                  \"tripMilage\" : 943.8829999999999,\n" +
"                  \"hos\" : {\n" +
"                    \"remainingDuty\" : 44.46666666666667,\n" +
"                    \"remainingDrive\" : 59.46666666666667,\n" +
"                    \"remainingWeekly\" : 3050.35,\n" +
"                    \"remainingBCP\" : 480.0\n" +
"                  },\n" +
"                  \"buffer\" : {\n" +
"                    \"initialBufferMinutes\" : 0.0,\n" +
"                    \"lastBufferMinutes\" : 0.0\n" +
"                  },\n" +
"                  \"possibleAppoinmentWindows\" : [{\n" +
"                      \"start\" : ISODate(\"2019-02-05T16:07:47.618Z\")\n" +
"                    }]\n" +
"                },\n" +
"                \"timeline\" : [{\n" +
"                    \"actionName\" : \"NONE\",\n" +
"                    \"locationName\" : \"N/A\",\n" +
"                    \"nextLocationName\" : \"N/A\",\n" +
"                    \"start\" : ISODate(\"2019-02-04T10:58:08.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-04T10:58:08.618Z\"),\n" +
"                    \"duration\" : 0.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"LOCATE\",\n" +
"                    \"locationName\" : \"N/A\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 30.474208259,\n" +
"                      \"lon\" : -87.2261379\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Current Location\",\n" +
"                    \"start\" : ISODate(\"2019-02-04T10:58:08.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-04T10:58:08.618Z\"),\n" +
"                    \"duration\" : 0.0,\n" +
"                    \"hosEventType\" : \"NONE\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"OFFDUTY\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 30.474208259,\n" +
"                      \"lon\" : -87.2261379\n" +
"                    },\n" +
"                    \"locationName\" : \"Current Location\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 30.474208259,\n" +
"                      \"lon\" : -87.2261379\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Current Location\",\n" +
"                    \"start\" : ISODate(\"2019-02-04T10:58:08.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-04T10:58:08.618Z\"),\n" +
"                    \"duration\" : 0.0,\n" +
"                    \"hosEventType\" : \"OFF_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DVIR\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 30.474208259,\n" +
"                      \"lon\" : -87.2261379\n" +
"                    },\n" +
"                    \"locationName\" : \"Current Location\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 30.474208259,\n" +
"                      \"lon\" : -87.2261379\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Current Location\",\n" +
"                    \"start\" : ISODate(\"2019-02-04T10:58:08.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-04T11:28:08.618Z\"),\n" +
"                    \"duration\" : 30.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 30.474208259,\n" +
"                      \"lon\" : -87.2261379\n" +
"                    },\n" +
"                    \"locationName\" : \"Current Location\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 35.679184,\n" +
"                      \"lon\" : -86.888152\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"$Parking Area Weigh Station I-65 North\",\n" +
"                    \"start\" : ISODate(\"2019-02-04T11:28:08.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-04T18:22:38.618Z\"),\n" +
"                    \"duration\" : 414.5,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 35.679184,\n" +
"                      \"lon\" : -86.888152\n" +
"                    },\n" +
"                    \"locationName\" : \"$Parking Area Weigh Station I-65 North\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"3,254750\",\n" +
"                      \"street\" : \"\",\n" +
"                      \"zip\" : \"37174\",\n" +
"                      \"city\" : \"Spring Hill\",\n" +
"                      \"state\" : \"TN\",\n" +
"                      \"country\" : \"United States\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 35.679184,\n" +
"                      \"lon\" : -86.888152\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"$Parking Area Weigh Station I-65 North\",\n" +
"                    \"start\" : ISODate(\"2019-02-04T18:22:38.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-04T18:37:38.618Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 35.679184,\n" +
"                      \"lon\" : -86.888152\n" +
"                    },\n" +
"                    \"locationName\" : \"$Parking Area Weigh Station I-65 North\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"3,254750\",\n" +
"                      \"street\" : \"\",\n" +
"                      \"zip\" : \"37174\",\n" +
"                      \"city\" : \"Spring Hill\",\n" +
"                      \"state\" : \"TN\",\n" +
"                      \"country\" : \"United States\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 35.859955,\n" +
"                      \"lon\" : -86.829723\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"@TA-Franklin #157\",\n" +
"                    \"start\" : ISODate(\"2019-02-04T18:37:38.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-04T18:52:15.618Z\"),\n" +
"                    \"duration\" : 14.616666666666667,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"SLEEPER\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 35.859955,\n" +
"                      \"lon\" : -86.829723\n" +
"                    },\n" +
"                    \"locationName\" : \"@TA-Franklin #157\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"3,698802\",\n" +
"                      \"street\" : \"4400 Peytonsville Road\",\n" +
"                      \"zip\" : \"37064\",\n" +
"                      \"city\" : \"Franklin\",\n" +
"                      \"state\" : \"TN\",\n" +
"                      \"country\" : \"United States\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 35.859955,\n" +
"                      \"lon\" : -86.829723\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"@TA-Franklin #157\",\n" +
"                    \"start\" : ISODate(\"2019-02-04T18:52:15.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-05T02:52:15.618Z\"),\n" +
"                    \"duration\" : 480.0,\n" +
"                    \"hosEventType\" : \"SLEEPER_BED\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DVIR\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 35.859955,\n" +
"                      \"lon\" : -86.829723\n" +
"                    },\n" +
"                    \"locationName\" : \"@TA-Franklin #157\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"3,698802\",\n" +
"                      \"street\" : \"4400 Peytonsville Road\",\n" +
"                      \"zip\" : \"37064\",\n" +
"                      \"city\" : \"Franklin\",\n" +
"                      \"state\" : \"TN\",\n" +
"                      \"country\" : \"United States\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 35.859955,\n" +
"                      \"lon\" : -86.829723\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"@TA-Franklin #157\",\n" +
"                    \"start\" : ISODate(\"2019-02-05T02:52:15.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-05T03:22:15.618Z\"),\n" +
"                    \"duration\" : 30.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 35.859955,\n" +
"                      \"lon\" : -86.829723\n" +
"                    },\n" +
"                    \"locationName\" : \"@TA-Franklin #157\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"3,698802\",\n" +
"                      \"street\" : \"4400 Peytonsville Road\",\n" +
"                      \"zip\" : \"37064\",\n" +
"                      \"city\" : \"Franklin\",\n" +
"                      \"state\" : \"TN\",\n" +
"                      \"country\" : \"United States\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 36.609884,\n" +
"                      \"lon\" : -86.58\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"$Weigh Station I-65 North\",\n" +
"                    \"start\" : ISODate(\"2019-02-05T03:22:15.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-05T04:25:37.618Z\"),\n" +
"                    \"duration\" : 63.36666666666667,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 36.609884,\n" +
"                      \"lon\" : -86.58\n" +
"                    },\n" +
"                    \"locationName\" : \"$Weigh Station I-65 North\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"3,254758\",\n" +
"                      \"street\" : \"\",\n" +
"                      \"zip\" : \"37148\",\n" +
"                      \"city\" : \"Portland\",\n" +
"                      \"state\" : \"TN\",\n" +
"                      \"country\" : \"United States\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 36.609884,\n" +
"                      \"lon\" : -86.58\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"$Weigh Station I-65 North\",\n" +
"                    \"start\" : ISODate(\"2019-02-05T04:25:37.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-05T04:40:37.618Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 36.609884,\n" +
"                      \"lon\" : -86.58\n" +
"                    },\n" +
"                    \"locationName\" : \"$Weigh Station I-65 North\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"3,254758\",\n" +
"                      \"street\" : \"\",\n" +
"                      \"zip\" : \"37148\",\n" +
"                      \"city\" : \"Portland\",\n" +
"                      \"state\" : \"TN\",\n" +
"                      \"country\" : \"United States\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 36.686824,\n" +
"                      \"lon\" : -86.537927\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"$Weigh Station I-65 North\",\n" +
"                    \"start\" : ISODate(\"2019-02-05T04:40:37.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-05T04:55:57.618Z\"),\n" +
"                    \"duration\" : 15.333333333333334,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 36.686824,\n" +
"                      \"lon\" : -86.537927\n" +
"                    },\n" +
"                    \"locationName\" : \"$Weigh Station I-65 North\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"3,254325\",\n" +
"                      \"street\" : \"\",\n" +
"                      \"zip\" : \"42134\",\n" +
"                      \"city\" : \"Franklin\",\n" +
"                      \"state\" : \"KY\",\n" +
"                      \"country\" : \"United States\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 36.686824,\n" +
"                      \"lon\" : -86.537927\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"$Weigh Station I-65 North\",\n" +
"                    \"start\" : ISODate(\"2019-02-05T04:55:57.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-05T05:10:57.618Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 36.686824,\n" +
"                      \"lon\" : -86.537927\n" +
"                    },\n" +
"                    \"locationName\" : \"$Weigh Station I-65 North\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"3,254325\",\n" +
"                      \"street\" : \"\",\n" +
"                      \"zip\" : \"42134\",\n" +
"                      \"city\" : \"Franklin\",\n" +
"                      \"state\" : \"KY\",\n" +
"                      \"country\" : \"United States\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 37.522015,\n" +
"                      \"lon\" : -85.88228\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"@Pilot Travel Center #392\",\n" +
"                    \"start\" : ISODate(\"2019-02-05T05:10:57.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-05T06:34:47.618Z\"),\n" +
"                    \"duration\" : 83.83333333333333,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"SLEEPER\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 37.522015,\n" +
"                      \"lon\" : -85.88228\n" +
"                    },\n" +
"                    \"locationName\" : \"@Pilot Travel Center #392\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"3,699068\",\n" +
"                      \"street\" : \"450 East Western Ave\",\n" +
"                      \"zip\" : \"42776\",\n" +
"                      \"city\" : \"Sonora\",\n" +
"                      \"state\" : \"KY\",\n" +
"                      \"country\" : \"United States\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 37.522015,\n" +
"                      \"lon\" : -85.88228\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"@Pilot Travel Center #392\",\n" +
"                    \"start\" : ISODate(\"2019-02-05T06:34:47.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-05T08:34:47.618Z\"),\n" +
"                    \"duration\" : 120.0,\n" +
"                    \"hosEventType\" : \"SLEEPER_BED\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 37.522015,\n" +
"                      \"lon\" : -85.88228\n" +
"                    },\n" +
"                    \"locationName\" : \"@Pilot Travel Center #392\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"3,699068\",\n" +
"                      \"street\" : \"450 East Western Ave\",\n" +
"                      \"zip\" : \"42776\",\n" +
"                      \"city\" : \"Sonora\",\n" +
"                      \"state\" : \"KY\",\n" +
"                      \"country\" : \"United States\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.290276,\n" +
"                      \"lon\" : -83.634642\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"$Weigh Station I-75 North\",\n" +
"                    \"start\" : ISODate(\"2019-02-05T08:34:47.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-05T14:14:29.618Z\"),\n" +
"                    \"duration\" : 339.7,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.290276,\n" +
"                      \"lon\" : -83.634642\n" +
"                    },\n" +
"                    \"locationName\" : \"$Weigh Station I-75 North\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"3,254612\",\n" +
"                      \"street\" : \"\",\n" +
"                      \"zip\" : \"43451\",\n" +
"                      \"city\" : \"Portage\",\n" +
"                      \"state\" : \"OH\",\n" +
"                      \"country\" : \"United States\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 41.290276,\n" +
"                      \"lon\" : -83.634642\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"$Weigh Station I-75 North\",\n" +
"                    \"start\" : ISODate(\"2019-02-05T14:14:29.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-05T14:29:29.618Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 41.290276,\n" +
"                      \"lon\" : -83.634642\n" +
"                    },\n" +
"                    \"locationName\" : \"$Weigh Station I-75 North\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"3,254612\",\n" +
"                      \"street\" : \"\",\n" +
"                      \"zip\" : \"43451\",\n" +
"                      \"city\" : \"Portage\",\n" +
"                      \"state\" : \"OH\",\n" +
"                      \"country\" : \"United States\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.348568,\n" +
"                      \"lon\" : -83.000886\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Redford\",\n" +
"                    \"start\" : ISODate(\"2019-02-05T14:29:29.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-05T16:07:47.618Z\"),\n" +
"                    \"duration\" : 98.3,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"APPOINTMENTWORK\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.348568,\n" +
"                      \"lon\" : -83.000886\n" +
"                    },\n" +
"                    \"locationName\" : \"Redford\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.348568,\n" +
"                      \"lon\" : -83.000886\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Redford\",\n" +
"                    \"start\" : ISODate(\"2019-02-05T16:07:47.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-05T18:07:47.618Z\"),\n" +
"                    \"duration\" : 120.0,\n" +
"                    \"hosEventType\" : \"OFF_DUTY\"\n" +
"                  }]\n" +
"              }, {\n" +
"                \"stopId\" : NumberLong(2),\n" +
"                \"details\" : {\n" +
"                  \"start\" : ISODate(\"2019-02-05T18:07:47.618Z\"),\n" +
"                  \"end\" : ISODate(\"2019-02-06T22:56:48.618Z\"),\n" +
"                  \"routeId\" : \"DEFAULT\"\n" +
"                },\n" +
"                \"kpis\" : {\n" +
"                  \"volutionMinutes\" : 35236.566666666666,\n" +
"                  \"earlyVolutionMinutes\" : 0.0,\n" +
"                  \"milage\" : 498.695,\n" +
"                  \"loadMilage\" : 1442.578,\n" +
"                  \"tripMilage\" : 1442.578,\n" +
"                  \"hos\" : {\n" +
"                    \"remainingDuty\" : 810.0,\n" +
"                    \"remainingDrive\" : 660.0,\n" +
"                    \"remainingWeekly\" : 2431.3333333333335,\n" +
"                    \"remainingBCP\" : 480.0\n" +
"                  },\n" +
"                  \"buffer\" : {\n" +
"                    \"initialBufferMinutes\" : 0.0,\n" +
"                    \"lastBufferMinutes\" : 0.0\n" +
"                  },\n" +
"                  \"possibleAppoinmentWindows\" : [{\n" +
"                      \"start\" : ISODate(\"2019-02-06T12:26:48.618Z\")\n" +
"                    }]\n" +
"                },\n" +
"                \"timeline\" : [{\n" +
"                    \"actionName\" : \"SLEEPER\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.348568,\n" +
"                      \"lon\" : -83.000886\n" +
"                    },\n" +
"                    \"locationName\" : \"Redford\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.348568,\n" +
"                      \"lon\" : -83.000886\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Redford\",\n" +
"                    \"start\" : ISODate(\"2019-02-05T18:07:47.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-06T02:07:47.618Z\"),\n" +
"                    \"duration\" : 480.0,\n" +
"                    \"hosEventType\" : \"SLEEPER_BED\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DVIR\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.348568,\n" +
"                      \"lon\" : -83.000886\n" +
"                    },\n" +
"                    \"locationName\" : \"Redford\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 42.348568,\n" +
"                      \"lon\" : -83.000886\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Redford\",\n" +
"                    \"start\" : ISODate(\"2019-02-06T02:07:47.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-06T02:37:47.618Z\"),\n" +
"                    \"duration\" : 30.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 42.348568,\n" +
"                      \"lon\" : -83.000886\n" +
"                    },\n" +
"                    \"locationName\" : \"Redford\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 40.030036,\n" +
"                      \"lon\" : -78.493045\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"South Midway Service Plaza, I-76 East\",\n" +
"                    \"start\" : ISODate(\"2019-02-06T02:37:47.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-06T09:22:10.618Z\"),\n" +
"                    \"duration\" : 404.3833333333333,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"BREAKSTOP\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 40.030036,\n" +
"                      \"lon\" : -78.493045\n" +
"                    },\n" +
"                    \"locationName\" : \"South Midway Service Plaza, I-76 East\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"11,703971\",\n" +
"                      \"street\" : \"Pennsylvania Turnpike\",\n" +
"                      \"zip\" : \"15522\",\n" +
"                      \"city\" : \"Bedford\",\n" +
"                      \"state\" : \"PA\",\n" +
"                      \"country\" : \"United States\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 40.030036,\n" +
"                      \"lon\" : -78.493045\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"South Midway Service Plaza, I-76 East\",\n" +
"                    \"start\" : ISODate(\"2019-02-06T09:22:10.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-06T09:52:10.618Z\"),\n" +
"                    \"duration\" : 30.0,\n" +
"                    \"hosEventType\" : \"OFF_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 40.030036,\n" +
"                      \"lon\" : -78.493045\n" +
"                    },\n" +
"                    \"locationName\" : \"South Midway Service Plaza, I-76 East\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"11,703971\",\n" +
"                      \"street\" : \"Pennsylvania Turnpike\",\n" +
"                      \"zip\" : \"15522\",\n" +
"                      \"city\" : \"Bedford\",\n" +
"                      \"state\" : \"PA\",\n" +
"                      \"country\" : \"United States\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 39.262135,\n" +
"                      \"lon\" : -77.310992\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"$Weigh Station I-270 South\",\n" +
"                    \"start\" : ISODate(\"2019-02-06T09:52:10.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-06T11:45:34.618Z\"),\n" +
"                    \"duration\" : 113.4,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"WEIGH\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 39.262135,\n" +
"                      \"lon\" : -77.310992\n" +
"                    },\n" +
"                    \"locationName\" : \"$Weigh Station I-270 South\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"3,254359\",\n" +
"                      \"street\" : \"\",\n" +
"                      \"zip\" : \"20871\",\n" +
"                      \"city\" : \"Clarksburg\",\n" +
"                      \"state\" : \"MD\",\n" +
"                      \"country\" : \"United States\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 39.262135,\n" +
"                      \"lon\" : -77.310992\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"$Weigh Station I-270 South\",\n" +
"                    \"start\" : ISODate(\"2019-02-06T11:45:34.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-06T12:00:34.618Z\"),\n" +
"                    \"duration\" : 15.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DRIVE\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 39.262135,\n" +
"                      \"lon\" : -77.310992\n" +
"                    },\n" +
"                    \"locationName\" : \"$Weigh Station I-270 South\",\n" +
"                    \"locationDetails\" : {\n" +
"                      \"identifier\" : \"3,254359\",\n" +
"                      \"street\" : \"\",\n" +
"                      \"zip\" : \"20871\",\n" +
"                      \"city\" : \"Clarksburg\",\n" +
"                      \"state\" : \"MD\",\n" +
"                      \"country\" : \"United States\"\n" +
"                    },\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 38.980808,\n" +
"                      \"lon\" : -77.09959\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Bethesda\",\n" +
"                    \"start\" : ISODate(\"2019-02-06T12:00:34.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-06T12:26:48.618Z\"),\n" +
"                    \"duration\" : 26.233333333333334,\n" +
"                    \"hosEventType\" : \"DRIVING\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"SLEEPER\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 38.980808,\n" +
"                      \"lon\" : -77.09959\n" +
"                    },\n" +
"                    \"locationName\" : \"Bethesda\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 38.980808,\n" +
"                      \"lon\" : -77.09959\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Bethesda\",\n" +
"                    \"start\" : ISODate(\"2019-02-06T12:26:48.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-06T20:26:48.618Z\"),\n" +
"                    \"duration\" : 480.0,\n" +
"                    \"hosEventType\" : \"SLEEPER_BED\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"DVIR\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 38.980808,\n" +
"                      \"lon\" : -77.09959\n" +
"                    },\n" +
"                    \"locationName\" : \"Bethesda\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 38.980808,\n" +
"                      \"lon\" : -77.09959\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Bethesda\",\n" +
"                    \"start\" : ISODate(\"2019-02-06T20:26:48.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-06T20:56:48.618Z\"),\n" +
"                    \"duration\" : 30.0,\n" +
"                    \"hosEventType\" : \"ON_DUTY\"\n" +
"                  }, {\n" +
"                    \"actionName\" : \"APPOINTMENTWORK\",\n" +
"                    \"location\" : {\n" +
"                      \"lat\" : 38.980808,\n" +
"                      \"lon\" : -77.09959\n" +
"                    },\n" +
"                    \"locationName\" : \"Bethesda\",\n" +
"                    \"nextLocation\" : {\n" +
"                      \"lat\" : 38.980808,\n" +
"                      \"lon\" : -77.09959\n" +
"                    },\n" +
"                    \"nextLocationName\" : \"Bethesda\",\n" +
"                    \"start\" : ISODate(\"2019-02-06T20:56:48.618Z\"),\n" +
"                    \"end\" : ISODate(\"2019-02-06T22:56:48.618Z\"),\n" +
"                    \"duration\" : 120.0,\n" +
"                    \"hosEventType\" : \"OFF_DUTY\"\n" +
"                  }]\n" +
"              }]\n" +
"          }]\n" +
"      }]\n" +
"  },\n" +
"  \"request\" : {\n" +
"    \"_id\" : ObjectId(\"5c581ac0683b5300016de7f9\"),\n" +
"    \"driverId\" : NumberLong(1565),\n" +
"    \"invocationTime\" : NumberLong(\"1549277888711\"),\n" +
"    \"loads\" : [{\n" +
"        \"loadId\" : \"5c3864835597fd0001d50adf\",\n" +
"        \"appointments\" : [{\n" +
"            \"stopId\" : NumberLong(1),\n" +
"            \"name\" : \"Redford\",\n" +
"            \"lat\" : 42.348568,\n" +
"            \"lon\" : -83.000886,\n" +
"            \"start\" : ISODate(\"2019-01-11T09:39:51.568Z\"),\n" +
"            \"end\" : ISODate(\"2019-01-13T09:39:00.000Z\"),\n" +
"            \"minimumHandlingTime\" : 120.0,\n" +
"            \"assistRequired\" : false\n" +
"          }, {\n" +
"            \"stopId\" : NumberLong(2),\n" +
"            \"name\" : \"Bethesda\",\n" +
"            \"lat\" : 38.980808,\n" +
"            \"lon\" : -77.09959,\n" +
"            \"start\" : ISODate(\"2019-01-11T09:40:11.795Z\"),\n" +
"            \"end\" : ISODate(\"2019-01-13T09:40:13.737Z\"),\n" +
"            \"minimumHandlingTime\" : 120.0,\n" +
"            \"assistRequired\" : false\n" +
"          }]\n" +
"      }],\n" +
"    \"organizationId\" : NumberLong(60),\n" +
"    \"requestActuals\" : {\n" +
"      \"currentLat\" : 30.474208259,\n" +
"      \"currentLon\" : -87.2261379,\n" +
"      \"requestTime\" : ISODate(\"2019-02-04T10:58:08.618Z\")\n" +
"    },\n" +
"    \"requestId\" : \"677f468d58db466d9977f47329b4becb\",\n" +
"    \"runOptions\" : {\n" +
"      \"disableDistanceMatrix\" : false,\n" +
"      \"disablePoiLoading\" : false,\n" +
"      \"maxRunTime\" : 3.0\n" +
"    }\n" +
"  },\n" +
"  \"token\" : \"677f468d58db466d9977f47329b4becb\"\n" +
"}";
    
}

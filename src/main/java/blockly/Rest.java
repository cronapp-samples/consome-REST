package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Rest {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Rest
public static Var alteraPosto() throws Exception {
 return new Callable<Var>() {

   private Var resp = Var.VAR_NULL;

   public Var call() throws Exception {
    resp = cronapi.util.Operations.getURLFromOthers(Var.valueOf("PUT"), Var.valueOf("application/json"), Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.url")).toString() + Var.valueOf("/api/cronapi/odata/v2/app/Posto").toString() + Var.valueOf("(\'").toString() + cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.idPosto")).toString() + Var.valueOf("\')").toString()), cronapi.map.Operations.createObjectMapWith(Var.valueOf("posto",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.nomePosto"))) , Var.valueOf("cidade",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.cidadePosto"))) , Var.valueOf("uf",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.ufPosto")))), cronapi.map.Operations.createObjectMapWith(Var.valueOf("X-AUTH-TOKEN",Var.valueOf(getToken()))), Var.VAR_NULL);
    System.out.println(resp.getObjectAsString());
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.resposta"), resp);
    return resp;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Rest
public static Var getPostos() throws Exception {
 return new Callable<Var>() {

   private Var resp = Var.VAR_NULL;

   public Var call() throws Exception {
    resp = cronapi.util.Operations.getURLFromOthers(Var.valueOf("GET"), Var.valueOf("application/json"), Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.url")).toString() + Var.valueOf("/api/cronapi/odata/v2/app/Posto?$format=json&$inlinecount=allpages&$skip=0&$top=100").toString()), Var.VAR_NULL, cronapi.map.Operations.createObjectMapWith(Var.valueOf("X-AUTH-TOKEN",Var.valueOf(getToken()))), Var.VAR_NULL);
    System.out.println(resp.getObjectAsString());
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.resposta"), resp);
    return resp;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Rest
public static Var getToken() throws Exception {
 return new Callable<Var>() {

   private Var resp = Var.VAR_NULL;

   public Var call() throws Exception {
    resp = cronapi.util.Operations.getURLFromOthers(Var.valueOf("POST"), Var.valueOf("application/x-www-form-urlencoded"), Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.url")).toString() + Var.valueOf("/auth").toString()), cronapi.map.Operations.createObjectMapWith(Var.valueOf("username",Var.valueOf("admin")) , Var.valueOf("password",Var.valueOf("admin"))), Var.VAR_NULL, Var.VAR_NULL);
    System.out.println(resp.getObjectAsString());
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.resposta"), resp);
    return cronapi.json.Operations.getJsonOrMapField(cronapi.json.Operations.toJson(resp), Var.valueOf("token"));
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Rest
public static Var inserePosto() throws Exception {
 return new Callable<Var>() {

   private Var resp = Var.VAR_NULL;

   public Var call() throws Exception {
    resp = cronapi.util.Operations.getURLFromOthers(Var.valueOf("POST"), Var.valueOf("application/json"), Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.url")).toString() + Var.valueOf("/api/cronapi/odata/v2/app/Posto").toString()), cronapi.map.Operations.createObjectMapWith(Var.valueOf("posto",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.nomePosto"))) , Var.valueOf("cidade",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.cidadePosto"))) , Var.valueOf("uf",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.ufPosto")))), cronapi.map.Operations.createObjectMapWith(Var.valueOf("X-AUTH-TOKEN",Var.valueOf(getToken()))), Var.VAR_NULL);
    System.out.println(resp.getObjectAsString());
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.resposta"), resp);
    return resp;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Rest
public static Var removePosto() throws Exception {
 return new Callable<Var>() {

   private Var resp = Var.VAR_NULL;

   public Var call() throws Exception {
    resp = cronapi.util.Operations.getURLFromOthers(Var.valueOf("DELETE"), Var.valueOf("application/json"), Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.url")).toString() + Var.valueOf("/api/cronapi/odata/v2/app/Posto").toString() + Var.valueOf("(\'").toString() + cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.idPosto")).toString() + Var.valueOf("\')").toString()), Var.VAR_NULL, cronapi.map.Operations.createObjectMapWith(Var.valueOf("X-AUTH-TOKEN",Var.valueOf(getToken()))), Var.VAR_NULL);
    System.out.println(resp.getObjectAsString());
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.resposta"), resp);
    return resp;
   }
 }.call();
}

}


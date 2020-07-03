package com.gestion_usuarios.gestion_usuarios.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gestion_usuarios.gestion_usuarios.controller.UserController;
import com.gestion_usuarios.gestion_usuarios.entities.UserEntitie;

public class UsersData {
    private static Map<Long, UserEntitie> wrecks = new HashMap<Long, UserEntitie>();
    private static Long idIndex = 3L;
    static {
      UserEntitie a = new UserEntitie(1L, "Carlos Vega",15, "Vega", "FAIR");
      wrecks.put(1L, a);
      UserEntitie b = new UserEntitie(2L, "Cesar Call",22, "Xamp", "Wis");
      wrecks.put(2L, b);
      UserEntitie c = new UserEntitie(2L, "Xavier Granda",31, "Zaml", "Wis");
      wrecks.put(3L, c);
    }
    public static List<UserEntitie> list() {
      return new ArrayList<UserEntitie>(wrecks.values());
    }
    public static UserEntitie create(UserEntitie wreck) {
      idIndex += idIndex;
      wreck.setId(idIndex);
      wrecks.put(idIndex, wreck);
      return wreck;
    }

    public static UserEntitie get(Long id) {
      return wrecks.get(id);
    }
    
    public static UserEntitie update(Long id, UserEntitie userEntitie) {
      wrecks.put(id, userEntitie);
      return userEntitie;
    }
    public static UserEntitie delete(Long id) {
      return wrecks.remove(id);
    }
}  
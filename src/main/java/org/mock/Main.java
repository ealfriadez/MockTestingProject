package org.mock;

import org.mock.persistence.entity.repository.PlayerRepositoryImpl;
import org.mock.service.PlayerServiceImpl;

public class Main {
    public static void main(String[] args) {
    	
    	PlayerRepositoryImpl playerRepositoryImpl = new PlayerRepositoryImpl();
    	PlayerServiceImpl playerServiceImpl = new PlayerServiceImpl(playerRepositoryImpl);
    
    	System.out.println(playerServiceImpl.findAll());
    }
}
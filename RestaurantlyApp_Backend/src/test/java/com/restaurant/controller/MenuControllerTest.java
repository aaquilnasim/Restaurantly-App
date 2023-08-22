package com.restaurant.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.Optional;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.restaurant.exception.ResourceNotFoundException;
import com.restaurant.model.Menu;
import com.restaurant.service.MenuService;

public class MenuControllerTest {

    @Mock
    private MenuService menuServiceMock;
    
    @InjectMocks
    private MenuController menuController;
    
    
    @Test
    public void testGetAllMenu() {
        ArrayList<Menu> expectedMenuList = new ArrayList<>();
        Menu menu1 = new Menu();
        menu1.setMenuID(1);
        menu1.setMenuName("Pizza");
        expectedMenuList.add(menu1);
        
        Menu menu2 = new Menu();
        menu2.setMenuID(2);
        menu2.setMenuName("Burger");
        expectedMenuList.add(menu2);
        
        when(menuServiceMock.getAllMenu()).thenReturn(expectedMenuList);
        
        ArrayList<Menu> actualMenuList = menuController.getAllMenu();
        
        assertNotNull(actualMenuList);
        assertEquals(expectedMenuList.size(), actualMenuList.size());
    }
    
    @Test
    public void testFindById() throws ResourceNotFoundException {
        int id = 1;
        Menu expectedMenu = new Menu();
        expectedMenu.setMenuID(id);
        expectedMenu.setMenuName("Pizza");
        Optional<Menu> optionalMenu = Optional.of(expectedMenu);
        
        when(menuServiceMock.findById(id)).thenReturn(optionalMenu);
        
        Optional<Menu> actualMenu = menuController.findById(id);
        
        assertNotNull(actualMenu);
        assertEquals(optionalMenu.get().getMenuID(), actualMenu.get().getMenuID());
        assertEquals(optionalMenu.get().getMenuName(), actualMenu.get().getMenuName());
    }
    
    @Test
    public void testAddMenu() {
        Menu expectedMenu = new Menu();
        expectedMenu.setMenuID(1);
        expectedMenu.setMenuName("Pizza");
        
        when(menuServiceMock.addMenu(expectedMenu));
        
        Menu actualMenu = menuController.addMenu(expectedMenu);
        
        assertNotNull(actualMenu);
        assertEquals(expectedMenu.getMenuID(), actualMenu.getMenuID());
        assertEquals(expectedMenu.getMenuName(), actualMenu.getMenuName());
    }
    
    @Test
    public void testUpdateMenu() {
        int id = 1;
        Menu expectedMenu = new Menu();
        expectedMenu.setMenuID(id);
        expectedMenu.setMenuName("Pizza");
        
        when(menuServiceMock.updateMenu(expectedMenu, id));
        
        Menu actualMenu = menuController.updateMenu(expectedMenu, id);
        
        assertNotNull(actualMenu);
        assertEquals(expectedMenu.getMenuID(), actualMenu.getMenuID());
        assertEquals(expectedMenu.getMenuName(), actualMenu.getMenuName());
    }
    
    @Test
    public void testDeleteMenu() {
        int id = 1;
        Menu expectedMenu = new Menu();
        expectedMenu.setMenuID(id);
        expectedMenu.setMenuName("Pizza");
        Optional<Menu> optionalMenu = Optional.of(expectedMenu);
        
        when(menuServiceMock.deleteMenu(id)).thenReturn(optionalMenu);
        
        Optional<Menu> actualMenu = menuController.deleteMenu(id);
        
        assertNotNull(actualMenu);
        assertEquals(optionalMenu.get().getMenuID(), actualMenu.get().getMenuID());
        assertEquals(optionalMenu.get().getMenuName(), actualMenu.get().getMenuName());
    }
}

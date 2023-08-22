import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuComponent } from './menu.component';
import { menu } from '../menu';
import { of } from 'rxjs';

describe('MenuComponent', () => {
  let component: MenuComponent;
  let fixture: ComponentFixture<MenuComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MenuComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should load all menus on initialization', () => {
    const expectedMenus: menu[] = [
      { menuID: 1, name: 'Indian', description: 'Description for Menu 1', price: 10 },
      { menuID: 2, name: 'Italian', description: 'Description for Menu 2', price: 15 },
    ];
    menuservices.getAllMenu.and.returnValue(of(expectedMenus));

    fixture.detectChanges();

    expect(component.menu).toEqual(expectedMenus);
  });

  it('should delete a menu', () => {
    const expectedMenus: menu[] = [
      { menuID: 1, name: 'Indian', description: 'Description for Menu 1', price: 10 },
      { menuID: 3, name: 'Italian', description: 'Description for Menu 3', price: 20 },
    ];
    component.allMenu = [
      { menuID: 1, name: 'Indian', description: 'Description for Menu 1', price: 10 },
      { menuID: 2, name: 'Italian', description: 'Description for Menu 2', price: 15 },
      { menuID: 3, name: 'French', description: 'Description for Menu 3', price: 20 },
    ];
    menuservices.delete.and.returnValue(of({}));
    component.ngOnInit();

    component.delete(2);

    expect(component.allMenu).toEqual(expectedMenus);
  });
});

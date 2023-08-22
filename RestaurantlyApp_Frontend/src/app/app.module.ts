import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { AboutComponent } from './about/about.component';
import { MenuComponent } from './menu/menu.component';
import { ContactComponent } from './contact/contact.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { GalleryComponent } from './gallery/gallery.component';
import { MenulistComponent } from './menulist/menulist.component';
import { LoginComponent } from './login/login.component';
import { CategoryComponent } from './category/category.component';
import { DishComponent } from './dish/dish.component';
import { MenuCreateComponent } from './menu-create/menu-create.component';
import { MenuEditComponent } from './menu-edit/menu-edit.component';
import { FormsModule } from '@angular/forms';
import { CategoryEditComponent } from './category-edit/category-edit.component';
import { CategoryCreateComponent } from './category-create/category-create.component';
import { DishCreateComponent } from './dish-create/dish-create.component';
import { DishEditComponent } from './dish-edit/dish-edit.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    AdminComponent,
    AboutComponent,
    MenuComponent,
    ContactComponent,
    GalleryComponent,
    MenulistComponent,
    LoginComponent,
    CategoryComponent,
    DishComponent,
    MenuCreateComponent,
    MenuEditComponent,
    CategoryEditComponent,
    CategoryCreateComponent,
    DishCreateComponent,
    DishEditComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

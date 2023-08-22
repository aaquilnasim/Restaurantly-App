import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { MenuComponent } from './menu/menu.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { GalleryComponent } from './gallery/gallery.component';
import { MenulistComponent } from './menulist/menulist.component';
import { LoginComponent } from './login/login.component';
import { CategoryComponent } from './category/category.component';
import { DishComponent } from './dish/dish.component';
import { MenuCreateComponent } from './menu-create/menu-create.component';
import { MenuEditComponent } from './menu-edit/menu-edit.component';
import { CategoryCreateComponent } from './category-create/category-create.component';
import { CategoryEditComponent } from './category-edit/category-edit.component';
import { DishEditComponent } from './dish-edit/dish-edit.component';
import { DishCreateComponent } from './dish-create/dish-create.component';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'home',component:HomeComponent},
  {path:'admin',component:AdminComponent},
  {path:'menuitems',component:MenuComponent},
  {path:'about',component:AboutComponent},
  {path:'gallery',component:GalleryComponent},
  {path:'contact',component:ContactComponent},
  {path:'menulist',component:MenulistComponent},
  {path:'categoryitems',component:CategoryComponent},
  {path:'dishitems',component:DishComponent},
  {path:'login',component:LoginComponent},
  {path:'editmenu/:id',component:MenuEditComponent},
  {path:'newmenu',component:MenuCreateComponent},
  {path:'newcategory',component:CategoryCreateComponent},
  {path:'editcategory/:id',component:CategoryEditComponent},
  {path:'newdish',component:DishCreateComponent},
  {path:'editdish/:id',component:DishEditComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RouterModule } from '@angular/router';
import {MatToolbarModule} from '@angular/material/toolbar';
import { MregistrationComponent } from './Manager/mregistration/mregistration.component';
import { LoginComponent } from './Manager/login/login.component';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { DashboardComponent } from './dashboard/dashboard.component';
import { CustomerComponent } from './CustomerDetail/customer/customer.component';
import { UpdateEmployeeComponent } from './CustomerDetail/update-employee/update-employee.component';


@NgModule({
  declarations: [
    AppComponent,
    MregistrationComponent,
    LoginComponent,
    DashboardComponent,
    CustomerComponent,
    UpdateEmployeeComponent
    ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

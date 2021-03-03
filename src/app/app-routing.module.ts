import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './Manager/login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { MregistrationComponent } from './Manager/mregistration/mregistration.component';
import { CustomerComponent } from './CustomerDetail/customer/customer.component';
import { UpdateEmployeeComponent } from './CustomerDetail/update-employee/update-employee.component';


const routes : Routes = [
  {path : '', component: LoginComponent},
  {path : 'Dashboard', component: DashboardComponent},
  {path : 'mregistration', component: MregistrationComponent},
  {path : 'CustomerDetail', component: CustomerComponent},
  {path : 'UpdateCustomer', component: UpdateEmployeeComponent}
];
@NgModule({
  
  imports: [RouterModule.forRoot(routes)
  ],
  exports : [RouterModule]
})
export class AppRoutingModule { }

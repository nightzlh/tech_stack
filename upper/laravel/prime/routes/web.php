<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});


/*
| This route is for hello world example
*/

Route::get('user/{id}', 'UserController@show');

/*
| This route is for db connection example
*/

Route::get('dbUser/{id}', 'UserController@showProfile');

/*
| These routes is used for validation example
*/

Route::get('post/create', 'PostController@create');

Route::post('post', 'PostController@store');

Auth::routes();

Route::get('/home', 'HomeController@index')->name('home');

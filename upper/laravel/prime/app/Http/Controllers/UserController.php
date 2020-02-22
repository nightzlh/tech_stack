<?php
namespace App\Http\Controllers;

use App\User;
use Illuminate\Support\Facades\DB;
use App\Http\Controllers\Controller;

class UserController extends Controller
{
    public function show($id)
    {
        return view('user.profile', ['user' => 'wang xiao er']);
    }

	public function showProfile($id) {
		$users = DB::select('select * from t_users where id = ?', [$id]);
		$name = '';
		foreach($users as $user) {
			$name = $user->name;
		}
        return view('user.dbProfile', ['user' => $name]);
	}
}

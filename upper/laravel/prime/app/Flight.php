<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Flight extends Model
{
    //
	protected $table = 'my_flights';

	protected $primaryKey = 'flight_id';

	// If you wish to use a non-incrementing or a non-numeric primary key
	// you must set the public $incrementing property on your model to false
	public $incrementing = false;
	
		
}

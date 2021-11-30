package com.ab.design.controlsystem.carrental;

/**
 * @author Arpit Bhardwaj
 *
 * Car rental system:
 *
 * This Car Rental Service will be operational only in one city (Delhi) which will have multiple branches (eg. Vasant Vihar Branch, CP branch, etc).
 * Each branch can have three different types of vehicles (VehicleType) : Sedan, Hatchback, SUV. There could be any number of car of each type in a branch.
 *
 *
 * The rental price per hour should be defined at “per branch per car type” level and NOT at an individual vehicle level. (eg. Sedan in CP branch = 150 rs/hr, Sedan in Vasant Vihar = 100 rs/hr, Hatchback in CP = 80rs/hr and so on)
 * A user can request to rent a particular vehicle type for a given time slot. You will have to allot the vehicle from one of the branches if available for the given time slot with the “lowest rental price” strategy.
 */
A typical bicycle drivetrain has a number of cogs on front crank (where the rider pedals) and a number of cogs on the rear cassette (on the wheel). The output ratio from the pedals to the rear wheel is:
tooth count on selected front cog / tooth count on selected rear cog
All cogs have an integer number of teeth and only a single cog on the front and single cog on the rear can be selected at one time.
For a given set of front and rear cogs:

a)	write a program that determines the gear combination providing the closest ratio rounding down. 
For example, input:
f_cogs = [38, 30]
r_cogs = [28, 23, 19, 16]
ratio = 1.6

yields output:
   		Front: 30, Rear: 19, Ratio 1.579

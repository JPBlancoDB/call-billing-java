A telecom company wants to implement a simple system for call billing.

In their call plans there are different types of tariff:

- regular calls at 0.05 pence per minute
- late night calls (for example from 10pm to 4am) at 0.02 pence per minute
- weekend calls at 0.01 pence per minute

There are two kinds of clients that the company manages:

- New clients who have been given a discount on their regular calls (regular calls pay the same rate as late night calls)
- Existing clients who pay the standard rates mentioned above

In addition the company uses the following rule to charge for local & international calls:

- International calls double the rate per minute

The company is interested in implementing a simple billing system to calculate the total charge to a client given their call history.

Please use an object oriented language of your choice to allow the company to calculate the total charge to a client given their call history.

Notes:

- You DO NOT need to implement any UI for this exercise.
- All the rules the company requires to calculate the charge for a call are given above. There are no other rules to apply.
- You can assume that the call history data is already given to you (you do not need to write code to load it from a file, database or similar source).
- You do not need to worry about determining if a call is local or international. You can assume there is a method that can do that for you.

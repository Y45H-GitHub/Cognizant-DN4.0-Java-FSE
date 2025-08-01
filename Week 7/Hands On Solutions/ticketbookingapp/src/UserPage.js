import React from "react";
import FlightList from "./FlightList";

function UserPage() {
  return (
    <div>
      <h2>Welcome User!</h2>
      <p>You are logged in. You can book tickets now.</p>
      <FlightList showBooking={true} />
    </div>
  );
}

export default UserPage;
